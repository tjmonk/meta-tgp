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
SRCREV = "4638cebea02274a36496fac33b045f1ef8788599"

S = "${WORKDIR}/git"

inherit cmake
inherit systemd

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

do_install:append() {
    install -d ${D}${sysconfdir}/systemd/system
    install -m 0644 ${WORKDIR}/varserver.service ${D}${sysconfdir}/systemd/system/
}

FILES:${PN} += "/etc/systemd/system/*"

SYSTEMD_SERVICE:${PN} = "varserver.service"
