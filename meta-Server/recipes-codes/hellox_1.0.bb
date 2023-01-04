DESCRIPTION = "Simple hello world application"
LICENSE = "CLOSED"

SRC_URI = "file://hello.c"

S = "${WORKDIR}"

do_compile(){
	${CC} hello.c ${LDFLAGS} -o marco 
}
do_install(){
	install -d ${D}${bindir}
	install -m 0755 marco ${D}${bindir}
}

