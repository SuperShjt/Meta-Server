DESCRIPTION = "Simple hello world application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += " qtbase wayland "
FILES_${PN} += " ${bindir}/testmain "

inherit qmake5


SRC_URI = "file://testmain.cpp \
	   file://Test.pro \
	   "

S = "${WORKDIR}"

do_install(){

	install -d ${D}${bindir}
	install -m 0775 Test ${D}${bindir}
}


