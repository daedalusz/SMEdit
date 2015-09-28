SMEdit
======

Notes:
* Using Oracle JDK V1.8
* Primarily Tested on Kubuntu 15.04


Forked to play around with.



#-=-=-=-=-=Instructions=-=-=-=-=-

* Project is already arranged into three Netbeans projects.
* master branch should compile (probably.... maybe)
* Projects will build into the below 'jar' files. 


### SMEdit.jar - Launcher
This component is a launcher for SMTools (jo_sm.jar). It's possible to launch SMTools without SMEdit, but it makes it easier to configure as it creates a config file.


### jo_sm.jar - SMTools, editor.
This package performs the heavy lifting, allowing editing of starmade blueprints.


### JoFileMods.jar - Plugins
This package provides a series of plugins to be used with SMTools and greatly expands what SMTools can actually accomplish.




#-=-=-=-=Installation=-=-=-=-

Prerequisites:
git
netbeans 
Starmade

1) clone the git repository to your local machine: git clone https://github.com/daedalusz/SMEdit.git

2) Open the netbeans projects and build each one. 

3) Place *SMEdit.jar* into your starmade home directory 
   (e.g ~/.local/share/Steam/steamapps/common/StarMade/)
   
4) Place *jo_sm.jar* into the 'third-party' directory, under your Starmade home folder 
   (e.g. ~/.local/share/Steam/steamapps/common/StarMade/StarMade/third-party)
   
5) Place *JoFileMods.jar* into the 'plugins' directory, under ./third-party/SMEdit 
   (e.g. ~/.local/share/Steam/steamapps/common/StarMade/StarMade/third-party/SMEdit/Plugins/)
   
6) Run *SMEdit.jar*, using 'java -jar SMEdit.jar' 




