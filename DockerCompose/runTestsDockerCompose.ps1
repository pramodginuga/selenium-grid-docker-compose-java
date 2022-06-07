#Powershell needs to be run as administrator, else it cannot start and stop docker service
#Commands to stop any docker service and start again. If you do not these, you can remove them
$processes = Get-Process "*docker desktop*"
if ($processes.Count -gt 0)
{
    $processes[0].Kill()
    $processes[0].WaitForExit()
}
Start-Process -Wait "C:\Program Files\Docker\Docker\Docker Desktop.exe"
#Starting docker compose. 
docker-compose up -d
#Maven Test
mvn clean test  
#Stopping docker compose. After stopping, vido will be generated.
docker-compose down
#Commands to stop docker service
$processes = Get-Process "*docker desktop*"
if ($processes.Count -gt 0)
{
    $processes[0].Kill()
    $processes[0].WaitForExit()
}
