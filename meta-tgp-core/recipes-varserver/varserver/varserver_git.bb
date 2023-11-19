# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/varserver.git;protocol=https;branch=main"
SRC_URI += "file://varserver.service"

# Modify these as desired
PV = "v0.31+git${SRCPV}"
SRCREV = "880a2d3bdc3d7b6d00a5ed3591028582458f7ddc"

S = "${WORKDIR}/git"

inherit cmake
inherit systemd

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

do_install_append() {
    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/varserver.service ${D}${systemd_system_unitdir}
}

FILES_${PN} += "${systemd_system_unitdir}/varserver.service"

SYSTEMD_SERVICE_${PN} = "varserver.service"
