LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/varserver.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.50+git${SRCPV}"
SRCREV = "39b73acdf657fd742a115df0683a7cffc0615f99"

S = "${WORKDIR}/git"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

