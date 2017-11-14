package cn.nickboyer.website.web.mybatisGen;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * @author Administrator
 *
 */
public class MybatisGenerator {

	public static void main(String[] args) {
		try {
			List<String> warnings = new ArrayList<String>();
			boolean overwrite = true;
			File configFile = new File("E:/workspace_for_neon3/springboot_web/src/main/resources/generator/generatorConfig_mysql.xml");
			ConfigurationParser cp = new ConfigurationParser(warnings);
			Configuration config = cp.parseConfiguration(configFile);
			DefaultShellCallback callback = new DefaultShellCallback(overwrite);
			MyBatisGenerator myBatisGenerator;
			myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
			myBatisGenerator.generate(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
