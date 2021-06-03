#!/bin/bash

PROJECT_ROOT=/home/pawel/Documents/INSYNC_backup/BACKUP_LUBUNTU/Backup/Studia_MGR/II_semestr/SRI/PD/PD5/rozwiazaniev2
JAVAC_PATH=/usr/lib/jvm/java-8-openjdk-amd64/bin/javac
JAVA_PATH=/usr/lib/jvm/java-8-openjdk-amd64/bin/java

kill -9 $(ps aux | grep 'orbd' | awk '{print $2}')
cd $PROJECT_ROOT
idlj -fall -oldImplBase -td src/ stockExchangeService.idl
$JAVAC_PATH src/*/*.java
orbd -ORBInitialPort 1050 -ORBInitialHost localhost&
sleep 2
cd src/
$JAVA_PATH Server.StockExchangeServiceServer -ORBInitialPort 1050 -ORBInitialHost localhost&