package configuration.manager

class Configuration {

	String name

	static hasMany = [supportedModels : String, components : ConfigurationComponent]

	static constraints = {
		name()
		supportedModels()
	}
}
