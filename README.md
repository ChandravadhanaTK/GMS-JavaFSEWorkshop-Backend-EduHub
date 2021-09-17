To do crud operations with postgressql database .You should to execute ddl commands to create the table  and then insert the sample data either insert in backend or update using Restful API.
Table-Name:

CREATE TABLE public."user"
(
    userid character varying(30) COLLATE pg_catalog."default" NOT NULL,
    firstname character varying(30) COLLATE pg_catalog."default" NOT NULL,
    lastname character varying(30) COLLATE pg_catalog."default",
    password text COLLATE pg_catalog."default",
    designation character varying(25) COLLATE pg_catalog."default",
    experience real,
    CONSTRAINT user_pkey PRIMARY KEY (userid)
)


Insert-Rest-API:
URL: http://localhost:8080/eduhubapi/v1/save
Method-Type: POST
Request-Body:
 {
    "userId": "MuhammadJeelan",
    "firstName": "Jeelan",
    "lastName": "Shaik Mohammed",
    "designation": "Consultant",
    "experience": 10.2,
    "password": "P@$$Word"
}

Update-Rest-API:
URL:http://localhost:8080/eduhubapi/v1/update
Method-Type: POST
Request-Body:
{
    "userId": "MuhammadJeelan",
    "firstName": "Shaik",
    "lastName": "Muhammad",
    "designation": "Consultant",
    "experience": 10.2,
    "password": "hello"
}

Delete-Rest-API: 
URL:http://localhost:8080/eduhubapi/v1/delete
Method-Type:POST
Request-Body:
{
    "userId": "Jeelan",
    "firstName": "Shaik",
    "lastName": "Muhammad",
    "designation": "Consultant",
    "experience": 10.2,
    "password": "hello"
}
Fetch-Rest-API:(AllUsers)
URL:http://localhost:8080/eduhubapi/v1/allusers
Method-Type:GET
Request-Body:
{
    "userId": "Jeelan",
    "firstName": "Shaik",
    "lastName": "Muhammad",
    "designation": "Consultant",
    "experience": 10.2,
    "password": "hello"
}
Fetch-Rest-API:(Specific Users)
URL:http://localhost:8080/eduhubapi/v1/user/Jeelan
Method-Type:GET
Request-Body:
{
    "userId": "Jeelan",
    "firstName": "Shaik",
    "lastName": "Muhammad",
    "designation": "Consultant",
    "experience": 10.2,
    "password": "hello"
}



COURSE TEAM DDL
====================

-- Table: public.courses

 

-- DROP TABLE public.courses;

 

CREATE TABLE public.courses
(
    courseid integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    coursename character varying(50) COLLATE pg_catalog."default",
    coursedesc character varying(50) COLLATE pg_catalog."default",
    skillrequired character varying(50) COLLATE pg_catalog."default",
    createdon timestamp without time zone,
    lastupdatedon timestamp without time zone,
    CONSTRAINT courses_pkey PRIMARY KEY (courseid)
)

 

TABLESPACE pg_default;

 

ALTER TABLE public.courses
    OWNER to postgres;

