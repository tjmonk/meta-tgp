# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/fcgi_vars;protocol=https;branch=main"

# Modify these as desired
PV = "v0.17+git${SRCPV}"
SRCREV = "e875590886a5807a0392419548839eb91d7c2e8f"

S = "${WORKDIR}/git"

DEPENDS="varserver sessionmgr fcgi"

# NOTE: the following library dependencies are unknown, ignoring: REQUIRED fcgi
#       (this is based on recipes that have previously been built and packaged)
inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

