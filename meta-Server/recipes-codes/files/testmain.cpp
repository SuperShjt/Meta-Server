#include <QApplication>
#include <QLabel>
#include <QWidget>

int main(int argc,char *argv[]){
QApplication app(argc,argv);
QLabel hello("<center>Welcome marco</center>");
hello.setWindowTitle("Program");
hello.resize(400,400);
hello.show();
return app.exec();


}
