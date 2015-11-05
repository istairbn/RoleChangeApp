# RoleChangeApp
Ben Newton
A Logscape App, designed to amend the Zone and Role of an agent remotely

This allows you make changes as an administrator without having to amend each file.

1. Either create a new properties file in the lib folder or edit the lib\config.properties file to set the changes you wish to make
   
   editedFile (the one you wish to change)
   oldString = The string in place at the moment
   newString = The one you want to replace

2. Edit the bundle file, specify the correct properties file and the agents you want to run it on

3. Zip it all up as RoleChangeApp-1.1.zip, then deploy to Logscape

Example properties File

oldString=-Dagent.role=dev.Management
newString=-Dagent.role=dev.UK.Management
editedFile=../../boot.properties
