package dev.fringe.support;

import org.mybatis.generator.api.ShellRunner;
 
public class GeneratorMapper {
	public static void main(String[] args) {
		ShellRunner.main(new String[]{ "-configfile",  "src\\main\\resources\\support\\generatorConfig.xml", "-overwrite" });
	}
}
