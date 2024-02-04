# Kafka demo application
****
## Installation
*****
1. Download kafka from the official page ,extract it change folder name to kafka
2. move to windows C folder for easy use
3. open the server.properties file ("/bin/windows/config/server.properties")
4. set the (' *log.dirs=c:/kafka/kafka-logs* ')
5. open the zookeeper.properties file ("/bin/windows/config/zookeeper.properties")
6. set the (' *data.dirs=c:/kafka/zookeeper-data* ')

### Start the zookeeper
****
- Go to the kafka root dir which is (' C:/kafka ')
- open cmd
- run the command 
- *.\bin\windows\zookeeper.server.start.bat .\config\zookeeper.properties*
- Do not close the terminal
### Start the Kafka server
****
- Go to the kafka root dir which is (' C:/kafka ')
- open cmd
- run the command
- *.\bin\windows\kafka.server.start.bat .\config\server.properties*
- do not close the terminal

### Kafka server is up and running

*Lets start creating spring boot application*