# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/gpioctrl;protocol=https;branch=scarthgap"

# Modify these as desired
PV = "v0.1+git${SRCPV}"
SRCREV = "ff298a8bece42638cccba14287c878b9fabad285"

S = "${WORKDIR}/git"

DEPENDS = "varserver libgpiod libtjson"

# NOTE: the following library dependencies are unknown, ignoring: gpiod REQUIRED
#       (this is based on recipes that have previously been built and packaged)
inherit cmake pkgconfig

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
