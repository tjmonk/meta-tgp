LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5dac46abad17db93b2a17020eeeabdca"

SRC_URI = "git://github.com/tjmonk/varserver.git;protocol=https;branch=main"

# Modify these as desired
PV = "v0.61+git${SRCPV}"
# SRCREV = tags/v0.61
SRCREV = "c9a1c2ad8ca06462b0ca0bff6b27cee157b8c0cb"

S = "${WORKDIR}/git"

inherit cmake

# Suppress compile errors
CFLAGS += " -Wno-error=stringop-overflow"
CFLAGS += " -Wno-error=stringop-truncation"

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""
