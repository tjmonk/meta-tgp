# Recipe created by recipetool

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=2caced0b25dfefd4c601d92bd15116de"

SRC_URI = "git://git.kernel.org/pub/scm/libs/libgpiod/libgpiod.git;protocol=https;branch=v1.6.x"

# Modify these as desired
PV = "v1.6.3+git${SRCPV}"
SRCREV = "bb4e5ce7071feed41bd3f0d9a62b5033fd483a18"

S = "${WORKDIR}/git"

# NOTE: the following prog dependencies are unknown, ignoring: python3-config bats doxygen help2man
# NOTE: unable to map the following pkg-config dependencies: catch2
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "glib-2.0 eudev kmod autoconf-archive"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit pkgconfig autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

