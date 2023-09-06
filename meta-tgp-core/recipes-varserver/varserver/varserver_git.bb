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
PV = "1.0+git${SRCPV}"
SRCREV = "b5f50539b34d82fa738be84035573fd5e4dcc46b"

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
