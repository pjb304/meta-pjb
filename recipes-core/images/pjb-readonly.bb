#include include recipes-core/images/core-image-minimal.bb
#include rpi-basicimage.bb
inherit core-image
IMAGE_FEATURES_append = " ssh-server-openssh"
LICENSE = "MIT"
IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL} kernel-modules vim htop screen bash"

IMAGE_INSTALL_append = " initscripts-readonly-rootfs-overlay"
#IMAGE_LINGUAS = " "

#IMAGE_ROOTFS_SIZE ?= "8192"
#IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"
