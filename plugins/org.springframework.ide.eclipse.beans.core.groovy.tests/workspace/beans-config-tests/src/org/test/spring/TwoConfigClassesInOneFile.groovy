package org.test.spring;

import org.springframework.context.annotation.Configuration;

@Configuration
public class TwoConfigClassesInOneFile {
}

@Configuration
class SecondConfigClassInForeignFile {
}
