DESCRIPTION = "AutoSSH application"
SECTION = "Misc Utils"
DEPENDS = ""
LICENSE_PATH += "${LAYERDIR}/custom-licenses"
SPDXLICENSEMAP[autossh-1] = "autossh-1"
LICENSE = "autossh-1"
LIC_FILES_CHKSUM = "file://COPYING;md5=663dffbc9a1adbf1d1b19a3e4ab318ad"
SRC_URI = "http://www.harding.motd.ca/autossh/autossh-1.4e.tgz"
SRC_URI[md5sum] = "f86684b96e99d22b2e9d35dc63b0aa29"
SRC_URI[sha256sum] = "9e8e10a59d7619176f4b986e256f776097a364d1be012781ea52e08d04679156"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"


do_configure_prepend() {
 cp /home/pjb1u12/poky/meta-pjb/custom-licenses/autossh-1 ${S}/COPYING
}
