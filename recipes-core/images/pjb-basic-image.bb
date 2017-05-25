#include include recipes-core/images/core-image-minimal.bb
#include rpi-basicimage.bb
inherit core-image
IMAGE_FEATURES_append = " ssh-server-openssh"
LICENSE = "MIT"
IMAGE_INSTALL = "packagegroup-core-boot  ${CORE_IMAGE_EXTRA_INSTALL} kernel-modules vim htop screen bash openvpn ntp"
