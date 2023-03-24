#주석사용 #은 안띄어도 됨. 
-- 이거도 주석! --은 무조건 앞에 한칸 띄어야 함.
/*부분 주석*/
/*
공간주석
구문 뒤에는 ;(세미클론) 붙여야 함
대소문자 구분 x
but 테이블 명과 필드의 이름은 대소문자 구분함
*/
/* DDL(데이터 정의어)
 데이터 베이스 혹은 테이블(뷰, 인덱스, 프로시저...)을 생성, 수정, 삭제 할 때
 사용하는 SQL문

/* CREATE 문
데이터 베이스, 테이블 등을 생성할 때 사용하는 SQL 문
데이터 베이스 생성
CREATE DATABASE 데이터베이스명; */
CREATE DATABASE Hotel;
SHOW DATABASES;
/* 테이터 베이스를 생성했으면 사용할 데이터베이스를 선택
USE 데이터베이스명;*/
USE Hotel;

/*테이블 생성
CREATE TABLE 테이블명(
필드명 데이터타입(데이터 길이) 제약조건,
...
);  테이블을 한번 만들고 나면 수정은 가능하지만 수정자체를 하지 않는것이 좋다 .
수정을 하게 되면 하위부분이든 다른부분까지 영향이 가기 때문에 복잡해지거나 정상작동이 안 될 수도 있다. */
CREATE TABLE Custom(
id INT primary KEy,
name varcharacter(20) NOT NULL,
email varchar(30) unique, # 장문의 문자열을 넣을 때 TEXT를 쓴다(길이 지정 x ) 
age INT,
address text ,
accept_marketing Boolean default false #Snake_Case를 사용
# default '부산광역시',문자열 표시엔 '' ,default는 값을 미리지정
);

SHOW TABLES;
/* 데이터베이스 수정
ALTER DATABASE 데이터베이스명 속성명 = 값;

테이블 필드 추가
ALTER TABLE 테이블명 ADD 필드명 데이터타입(데이터길이) 제약조건;
테이블 필드 삭제
ALTER TABLE 테이블명 DROP 필드명;
테이블 필드 수정
ALTER TABLE 테이블명 MODIFY COLUMN 필드명 데이터타입(데이터길이) 제약조건;

데이터 베이스 삭제
DROP DATABASE 데이터베이스명;
TURNCATE문은 - 초기화  = > 인덱스가 다시 1번부터 ... 
DELETE 문은 해당 데이터만 날림. => 인덱스가 20번에서 delete하면 21번부터..

테이블 삭제
DROP TABLE 테이블명; : 테이블의 정의 자체를 제거
테이블이 존재하지 않으면 에러가 발생함 
따라서 DROP TABLE/DATABASE IF EXIST hotel; 이렇게 if를 넣는다.

TRUNCATE TABLE 테이블명; : 테이블을 정의만 남기고 모두 제거(생성 초기상태로 돌림)

BLOB 과 TEXT는 비슷하지만 TEXT는 문자열의 대소문자를 구분한다.
bin 파일은 2진으로 , 실행하는 파일*/

