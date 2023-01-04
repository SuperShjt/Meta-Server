#include "myserver.h"

myserver::myserver(QObject *parent)
    : QObject{parent}
{
    server = new QTcpServer();
    connect(server,SIGNAL(newConnection()),this,SLOT(newConnection()));
    if(!server->listen(QHostAddress::Any,1234)){
        qDebug() << "Server couldn't start";
    }
    else{
        qDebug() << "Server on";
    }

}
void myserver::newConnection(){

    QTcpSocket *socket = server->nextPendingConnection();
    socket->write("Hello Client");
    socket->flush();
    socket->waitForBytesWritten(3000);

    socket->waitForReadyRead(3000);
    qDebug() << "Reading: " << socket->bytesAvailable();

    qDebug() << socket->readAll();



}
