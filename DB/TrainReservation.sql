# 기차 예약 데이터베이스 생성 
CREATE DATABASE train_reservation;
USE train_reservation;
 
# 가격 테이블 생성 
# 역과 역사이의 거리에 따라 금액이 책정되는것.(원래 기차종류까지 추가) 
CREATE TABLE Cost ( 
    departure_station VARCHAR(50) NOT NULL,
    arrival_station VARCHAR(50) NOT NULL,
    amount INT NOT NULL
);
# departure 와 arrival 이 Cost랑 Train에 같이 있다 . 중복되어있음
# 그래서 두개를 따로 빼서 하나로 만들어준다.
CREATE TABLE Train (
    train_number VARCHAR(10) PRIMARY KEY,
    departure_station VARCHAR(50) NOT NULL,
    departure_time TIME NOT NULL,
    arrival_station VARCHAR(50) NOT NULL,
    arrival_time TIME NOT NULL,
    take_minute TIME NOT NULL,
    type VARCHAR(10) NOT NULL
);
  # Object 타입으로 된 배열은 관리 할 수 없다 . 그래서 따로 정의 해놔야한다.

CREATE TABLE Station (
    station_number INT AUTO_INCREMENT PRIMARY KEY,
    station_nume VARCHAR(50) NOT NULL,
    address TEXT NOT NULL UNIQUE,
    tel_number VARCHAR(15) NOT NULL UNIQUE
);
/*	관계를 필드로 표현할지, 테이블로 표현할지 관계정도에 따라 다름
    기차와 역사이에는 일대다의 관계가 형성. 하나의 역에서 출발하는 특정기차는 하나이지만
    특정역에서는 여러대의 기차가 출발한다. -> 이거는 주체에 따라 다름. 
    하나의 레코드에 하나의 데이터만 들어가야되서 다대다를 표현하기가 불가능하다.
    그래서 관계테이블을 하나 만든다..
    테이블을 만들적에 실제로 존재하는 물체가 뭐가있는지 파악한다.
    ex 영수증 , 영수증은 실제로 보이는것이다. 이 영수증이 왜 나왔는지를 봐야한다.
    사람이 물건을 샀기 때문에 나온다. 결론은 사람과 영수증인 관계가 있다. 
	즉 station과 cost테이블은 관계가 있다. 
    하나의 기차가 여러 정거장에서 정거하고 , 한 정거장에서는 여러대의 기차가 정거한다.
    다대다 관계다.
*/
 
 CREATE TABLE STOP_STATION(
    station_number INT NOT NULL,
    train_number varchar(10) not null,
    departure_time TIME NOT NULL,
    arrival_time TIME NOT NULL
);
 /* 좌석 관리를 어떻게 할것인지 .....  
 좌석 = 어떤기차, 몇 호실 , 몇번째  일대다의 관계가 맺어진다.
 어떻게 정의할 것인가.....?*/
 CREATE TABLE SEAT (
    type VARCHAR(10),
    seat_number VARCHAR(2),
    train_type VARCHAR(10)
);
 
 
 
 