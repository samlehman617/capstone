package api.db.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.internal.AbstractApplicationMetadata;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * A {@link com.speedment.runtime.core.ApplicationMetadata} class for the {@link
 * com.speedment.runtime.config.Project} named capitalfun. This class contains
 * the meta data present at code generation time.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public class GeneratedCapitalfunMetadata extends AbstractApplicationMetadata {
    
    private final static String METADATA = init();
    
    private static String init() {
        final StringBuilder sb = new StringBuilder();
        initPart0(sb);
        initPart1(sb);
        initPart2(sb);
        initPart3(sb);
        initPart4(sb);
        return sb.toString();
    }
    
    @Override
    protected Optional<String> getMetadata() {
        return Optional.of(METADATA);
    }
    
    private static void initPart0(StringBuilder sb) {
        Stream.of(
            "{",
            "  \"config\" : {",
            "    \"expanded\" : true,",
            "    \"appId\" : \"14a1f780-c59c-4bd7-808f-42d38312939a\",",
            "    \"companyName\" : \"company\",",
            "    \"name\" : \"capitalfun\",",
            "    \"packageLocation\" : \"src/main/java/\",",
            "    \"id\" : \"capitalfun\",",
            "    \"packageName\" : \"api.db\",",
            "    \"dbmses\" : [",
            "      {",
            "        \"expanded\" : true,",
            "        \"port\" : 3306,",
            "        \"schemas\" : [",
            "          {",
            "            \"expanded\" : true,",
            "            \"tables\" : [",
            "              {",
            "                \"expanded\" : true,",
            "                \"foreignKeys\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"foreignKeyColumns\" : [",
            "                      {",
            "                        \"foreignDatabaseName\" : \"capitalfun\",",
            "                        \"foreignSchemaName\" : \"capitalfun\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"username\",",
            "                        \"foreignColumnName\" : \"username\",",
            "                        \"id\" : \"username\",",
            "                        \"foreignTableName\" : \"users\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"applications_ibfk_1\",",
            "                    \"id\" : \"applications_ibfk_1\",",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"primaryKeyColumns\" : [",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"id\" : \"id\",",
            "                    \"ordinalPosition\" : 1",
            "                  }",
            "                ],",
            "                \"indexes\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : true,",
            "                    \"name\" : \"PRIMARY\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"id\",",
            "                        \"id\" : \"id\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"id\" : \"PRIMARY\",",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : false,",
            "                    \"name\" : \"username\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"username\",",
            "                        \"id\" : \"username\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"id\" : \"username\",",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"isView\" : false,",
            "                \"columns\" : [",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Integer\",",
            "                    \"expanded\" : true,",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"nullable\" : false,",
            "                    \"autoIncrement\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"id\" : \"id\",",
            "                    \"ordinalPosition\" : 1,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"applicantName\",",
            "                    \"id\" : \"applicantName\",",
            "                    \"ordinalPosition\" : 2,"
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart1(StringBuilder sb) {
        Stream.of(
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Integer\",",
            "                    \"expanded\" : true,",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"age\",",
            "                    \"id\" : \"age\",",
            "                    \"ordinalPosition\" : 3,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Integer\",",
            "                    \"expanded\" : true,",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"income\",",
            "                    \"id\" : \"income\",",
            "                    \"ordinalPosition\" : 4,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Integer\",",
            "                    \"expanded\" : true,",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"creditScore\",",
            "                    \"id\" : \"creditScore\",",
            "                    \"ordinalPosition\" : 5,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Integer\",",
            "                    \"expanded\" : true,",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"expenses\",",
            "                    \"id\" : \"expenses\",",
            "                    \"ordinalPosition\" : 6,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"applicantId\",",
            "                    \"id\" : \"applicantId\",",
            "                    \"ordinalPosition\" : 7,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"username\",",
            "                    \"id\" : \"username\",",
            "                    \"ordinalPosition\" : 8,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Double\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"result\",",
            "                    \"id\" : \"result\",",
            "                    \"ordinalPosition\" : 9,",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"name\" : \"applications\",",
            "                \"id\" : \"applications\",",
            "                \"packageName\" : \"api.db.applications\",",
            "                \"enabled\" : true",
            "              },",
            "              {",
            "                \"expanded\" : true,",
            "                \"foreignKeys\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"foreignKeyColumns\" : [",
            "                      {",
            "                        \"foreignDatabaseName\" : \"capitalfun\",",
            "                        \"foreignSchemaName\" : \"capitalfun\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"username\",",
            "                        \"foreignColumnName\" : \"username\",",
            "                        \"id\" : \"username\",",
            "                        \"foreignTableName\" : \"users\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"logos_ibfk_1\",",
            "                    \"id\" : \"logos_ibfk_1\",",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"primaryKeyColumns\" : [",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"id\","
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart2(StringBuilder sb) {
        Stream.of(
            "                    \"id\" : \"id\",",
            "                    \"ordinalPosition\" : 1",
            "                  }",
            "                ],",
            "                \"indexes\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : true,",
            "                    \"name\" : \"PRIMARY\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"id\",",
            "                        \"id\" : \"id\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"id\" : \"PRIMARY\",",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : false,",
            "                    \"name\" : \"username\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"username\",",
            "                        \"id\" : \"username\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"id\" : \"username\",",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"isView\" : false,",
            "                \"columns\" : [",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"expanded\" : true,",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"nullable\" : false,",
            "                    \"autoIncrement\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"id\" : \"id\",",
            "                    \"ordinalPosition\" : 1,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"piclink\",",
            "                    \"id\" : \"piclink\",",
            "                    \"ordinalPosition\" : 2,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.sql.Timestamp\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"time\",",
            "                    \"id\" : \"time\",",
            "                    \"ordinalPosition\" : 3,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"result\",",
            "                    \"id\" : \"result\",",
            "                    \"ordinalPosition\" : 4,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"username\",",
            "                    \"id\" : \"username\",",
            "                    \"ordinalPosition\" : 5,",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"name\" : \"logos\",",
            "                \"id\" : \"logos\",",
            "                \"packageName\" : \"api.db.logos\",",
            "                \"enabled\" : true",
            "              },",
            "              {",
            "                \"expanded\" : true,",
            "                \"primaryKeyColumns\" : [",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"username\",",
            "                    \"id\" : \"username\",",
            "                    \"ordinalPosition\" : 1"
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart3(StringBuilder sb) {
        Stream.of(
            "                  },",
            "                  {",
            "                    \"expanded\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"id\" : \"id\",",
            "                    \"ordinalPosition\" : 1",
            "                  }",
            "                ],",
            "                \"indexes\" : [",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : false,",
            "                    \"name\" : \"id\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"id\",",
            "                        \"id\" : \"id\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"id\" : \"id\",",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : true,",
            "                    \"name\" : \"PRIMARY\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"username\",",
            "                        \"id\" : \"username\",",
            "                        \"ordinalPosition\" : 1",
            "                      },",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"id\",",
            "                        \"id\" : \"id\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"id\" : \"PRIMARY\",",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"expanded\" : false,",
            "                    \"unique\" : true,",
            "                    \"name\" : \"username\",",
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"orderType\" : \"ASC\",",
            "                        \"expanded\" : true,",
            "                        \"name\" : \"username\",",
            "                        \"id\" : \"username\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"id\" : \"username\",",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"isView\" : false,",
            "                \"columns\" : [",
            "                  {",
            "                    \"databaseType\" : \"java.lang.Long\",",
            "                    \"expanded\" : true,",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"nullable\" : false,",
            "                    \"autoIncrement\" : true,",
            "                    \"name\" : \"id\",",
            "                    \"id\" : \"id\",",
            "                    \"ordinalPosition\" : 1,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"username\",",
            "                    \"id\" : \"username\",",
            "                    \"ordinalPosition\" : 2,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"name\" : \"password\",",
            "                    \"id\" : \"password\",",
            "                    \"ordinalPosition\" : 3,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"firstname\","
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart4(StringBuilder sb) {
        Stream.of(
            "                    \"id\" : \"firstname\",",
            "                    \"ordinalPosition\" : 4,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"lastname\",",
            "                    \"id\" : \"lastname\",",
            "                    \"ordinalPosition\" : 5,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : true,",
            "                    \"name\" : \"profpicurl\",",
            "                    \"id\" : \"profpicurl\",",
            "                    \"ordinalPosition\" : 6,",
            "                    \"enabled\" : true",
            "                  },",
            "                  {",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"expanded\" : true,",
            "                    \"nullable\" : false,",
            "                    \"enumConstants\" : \"USER,ADMIN\",",
            "                    \"name\" : \"role\",",
            "                    \"id\" : \"role\",",
            "                    \"ordinalPosition\" : 7,",
            "                    \"enabled\" : true",
            "                  }",
            "                ],",
            "                \"name\" : \"users\",",
            "                \"id\" : \"users\",",
            "                \"packageName\" : \"api.db.users\",",
            "                \"enabled\" : true",
            "              }",
            "            ],",
            "            \"name\" : \"capitalfun\",",
            "            \"id\" : \"capitalfun\",",
            "            \"enabled\" : true",
            "          }",
            "        ],",
            "        \"typeName\" : \"MySQL\",",
            "        \"ipAddress\" : \"aa4jcmnbjv1svu.c21ogdmq7qho.us-east-2.rds.amazonaws.com\",",
            "        \"name\" : \"capitalfun\",",
            "        \"id\" : \"capitalfun\",",
            "        \"enabled\" : true,",
            "        \"username\" : \"capitalone\"",
            "      }",
            "    ],",
            "    \"enabled\" : true",
            "  }",
            "}"
        ).forEachOrdered(sb::append);
    }
}