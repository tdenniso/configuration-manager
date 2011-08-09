package configuration.manager

class ConfigurationComponent {

	String name
	byte[] artifact
	
	static hasMany = [configurations : Configuration]
	static belongsTo = Configuration
	
    static constraints = {
		name()
		artifact()
    }
}
