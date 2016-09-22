DESCRIPTION = "C++11 CoAP library"
AUTHOR = "Martin Mosler"
HOMEPAGE = "http://github.com/zerom0/CoAPP"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9741c346eef56131163e13b9db1241b3"

PR = "r0"

SRCREV = "06e35c2deb407529960684e3142533e81665e1b6"
SRC_URI = " \
    git://github.com/zerom0/CoAPP;branch=yocto;protocol=git \
    file://0001-without_gtest.patch \
 "

S = "${WORKDIR}/git"

inherit pkgconfig cmake

FILES_${PN} += "${libdir}/libcoap.so"
FILES_${PN}-dev = "${includedir}/coap/*.h"
