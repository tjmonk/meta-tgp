# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://git@bitbucket.org/monktj/vartest.git;protocol=ssh"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "41fdd929beec418e7a51969010e08167545b6391"

S = "${WORKDIR}/git"

# NOTE: the following library dependencies are unknown, ignoring: REQUIRED
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "libvarserver"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = ""

