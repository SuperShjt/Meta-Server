DESCRIPTION = "Simple hello world application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += " qtbase"
FILES_${PN} += " ${bindir}/QTServer "

inherit qmake5 update-rc.d


SRC_URI = "file://main.cpp \
	   file://myserver.cpp \
	   file://myserver.h \
	   file://QTServer.pro \
	   "

S = "${WORKDIR}"

do_install(){

	install -d ${D}${bindir}
	install -m 0775 QTServer ${D}${bindir}
	install -d ${D}${sysconfdir}/init.d
	install -m 0775 QTServer ${D}${sysconfdir}/init.d/QTServer

}	

INITSCRIPT_NAME = "QTServer"
INITSCRIPT_PARAMS = "defaults 10"

