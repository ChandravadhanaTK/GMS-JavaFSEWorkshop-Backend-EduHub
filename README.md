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

=======
Postgress User table DDL 
--------------------------
CREATE TABLE public.user_profile
(
    id serial,
    username character varying(50) COLLATE pg_catalog."default" NOT NULL,
    password character varying(50) COLLATE pg_catalog."default" NOT NULL,
    firstname character varying(50) COLLATE pg_catalog."default",
    secondname character varying(50) COLLATE pg_catalog."default",
    emailid character varying(255) COLLATE pg_catalog."default" NOT NULL,
    mobile character varying(50) COLLATE pg_catalog."default" NOT NULL,
    location character varying(50) COLLATE pg_catalog."default",
    designation character varying(50) COLLATE pg_catalog."default",
    experience integer NOT NULL,
    primaryskills character varying(100) COLLATE pg_catalog."default",
    secondaryskills character varying(100) COLLATE pg_catalog."default",
    role character varying(50) COLLATE pg_catalog."default" NOT NULL,
    createdon timestamp without time zone NOT NULL,
    lastlogin timestamp without time zone NOT NULL,
    CONSTRAINT userid_pkey PRIMARY KEY (id),
    CONSTRAINT unique_emailid UNIQUE (emailid),
    CONSTRAINT unique_role UNIQUE (role),
    CONSTRAINT unique_username UNIQUE (username)
)

Postgress Mentor table DDL 
--------------------------
CREATE TABLE public.mentor
(
    "availabilityid " serial,
    userid serial,
    startdatetime timestamp without time zone NOT NULL,
    enddatetime timestamp without time zone NOT NULL,
    "mentoringSkill" character varying(100),
    "mentoredHours" character varying(50) NOT NULL,
    "mentorRating" character varying(50),
    "aboutMentor" character varying(255) NOT NULL,
    last_updated_on timestamp without time zone NOT NULL,
    CONSTRAINT "Primary" PRIMARY KEY ("availabilityid "),
    CONSTRAINT "User id of Mentor" FOREIGN KEY (userid)
        REFERENCES public.user_profile (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);

Postgress Learner table DDL

CREATE TABLE public.learner
(
    requestid integer NOT NULL DEFAULT nextval('"LEARNER_requestId_seq"'::regclass),
    userid integer NOT NULL DEFAULT nextval('"LEARNER_userid_seq"'::regclass),
    role character varying(50) COLLATE pg_catalog."default" NOT NULL,
    courseid integer NOT NULL DEFAULT nextval('"LEARNER_courseId_seq"'::regclass),
    rmid integer NOT NULL DEFAULT nextval('"LEARNER_rmid_seq"'::regclass),
    approvalid integer NOT NULL DEFAULT nextval('"LEARNER_approvalId_seq"'::regclass),
    approvalstatus character varying(255) COLLATE pg_catalog."default" NOT NULL,
    statusmessage character varying(255) COLLATE pg_catalog."default" NOT NULL,
    assignmentid integer NOT NULL DEFAULT nextval('"LEARNER_assignmentId_seq"'::regclass),
    assignmentstatus character varying(255) COLLATE pg_catalog."default" NOT NULL,
    assignmentstatusmessage character varying(255) COLLATE pg_catalog."default" NOT NULL,
    learnerdescription character varying(50) COLLATE pg_catalog."default" NOT NULL,
    learnerscore character varying(50) COLLATE pg_catalog."default" NOT NULL,
    lastupdatedon timestamp without time zone NOT NULL,
    CONSTRAINT learner_pkey PRIMARY KEY (requestid)
)
