require recipes-tgp-services/images/tgp-services-image.bb

DESCRIPTION = "The Gateway Project Core Components" 

IMAGE_INSTALL += "libjson libvarserver varserver getvar setvar tcc libtemplate libvarcreate libvmcore libluavars libvmasm libvarvm varcreate vartest vasm vexe vm print-template sysconf"

