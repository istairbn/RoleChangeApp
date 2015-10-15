/*
#################################################################
# BootPropertiesChange.Groovy
# Author - Benjamin Newton
# Excelian
# Ben.Newton@excelian.com
#
# This code changes the strings within the file set in the config
#################################################################
*/

import java.io.File.*
import java.nio.file.*

Properties properties = new Properties()
def props = args.length > 0 ? "./lib/" + args[0] : "./lib/config.properties"
def propertiesFile = new File(props)

if (propertiesFile.exists()){
	propertiesFile.withInputStream{
    	properties.load(it)
    	}
	}

else
	{
	println "No Properties File Present"
	println System.getProperty("user.dir")
	return 0
	}
	
def stamp = new Date()

println "$stamp, Checking for file"

def bootProps = new File(properties.editedFile)

if(bootProps.exists()){
	println "$stamp, $properties.editedFile exists"
	}

else{
	println "$stamp, $properties.editedFile does not exist"
	println System.getProperty("user.dir")
	return 0
	}

def fileText = bootProps.text

def oldOne = properties.oldString
def newOne = properties.newString

println "$stamp, $properties.oldString $properties.newString" 

fileText = (fileText =~ oldOne).replaceFirst(newOne)

bootProps.write(fileText)

println "$stamp, Boot.Properties successfully altered"
