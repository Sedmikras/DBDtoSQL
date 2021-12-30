# DBDtoSQL
School course KIV/SAR </br>
Database Description (DBD) Generation utility to Data Definition Language (DDL). </br>
Running on Java 11 </br>
used frameworks:
- ANTLR4
- jOOQ 
- spring-beans
- JUnit4

# Usage
Run Main with arguments:
- path to dbd file 
- path to output
- sql dialect

## SQL Dialects:
Supported SQL dialects:
- MSSQL
- MySQL
- PostgreSQL
- MariaDB
- ORACLE
- more (https://www.jooq.org/javadoc/latest/org.jooq/org/jooq/SQLDialect.html)