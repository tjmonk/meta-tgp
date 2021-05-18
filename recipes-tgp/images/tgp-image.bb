require recipes-tgp-services/images/tgp-services-image.bb

DESCRIPTION = "The Gateway Project Core Components" 

IMAGE_INSTALL += "libjson libvarserver libvarserver-dev varserver getvar setvar tcc libtemplate libvarcreate libvmcore libluavars libvmasm libvarvm-dev varcreate vartest vasm vexe vm print-template tgp-corefs execvars filevars fcgi-vars"
IMAGE_INSTALL += " fcgi-test"
IMAGE_INSTALL += " gpioctrl"

