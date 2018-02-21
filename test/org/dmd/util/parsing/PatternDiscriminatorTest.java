package org.dmd.util.parsing;

import org.junit.Test;

public class PatternDiscriminatorTest {

	@Test
	public void test(){
		PatternDiscriminator pd = new PatternDiscriminator(10,false,false);
		
		pd.analyze("-81.984389");
		pd.analyze("-41.3166");
		pd.analyze("-71 57 59");
		pd.analyze("--71.76");
		
		for(Pattern p: pd.getPatterns())
			System.out.println(p.toString());
		
		for(String s: pd.getFormattedPatterns())
			System.out.println(s);
	}
}
