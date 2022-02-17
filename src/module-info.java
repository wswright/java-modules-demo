module example.ModuleDemo {
	requires example.ModuleDemoLib;
	requires example.ModuleDemoService;
	uses com.example.lib.NameProvider;
	exports com.example.modules;
}