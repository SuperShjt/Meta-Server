SUMMARY = "Simple hello world image"
DESCRIPTION = "Simple hello world image"
LICENSE = "MIT"
inherit core-image
include recpies-core/images/core-image-minimal.bb
IMAGE_INSTALL += " qtserialport \
 qtvirtualkeyboard \
 qtquickcontrols \ 
 qtquickcontrols-qmlplugins \
 qtquickcontrols2 \
 qtquickcontrols2-qmlplugins \
 qtnetworkauth \
 qtwebsockets \
 qtbase \
 qtgraphicaleffects \
 qtscript \
 qtscxml \
 qttools \
 qtwebchannel \
 qtwebglplugin \
 qtxmlpatterns \
 qtsystems \
 qtimageformats \
 qtserialbus \
 qtdeclarative \
 qtmultimedia \ 
 qtconnectivity \
 hellox \
 server \
 qtwayland \
 ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'qtwayland', '', d)} "

