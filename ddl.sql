CREATE TABLE public.thirdparty
(
  id integer NOT NULL DEFAULT nextval('thirdparty_id_seq'::regclass),
  market character(20),
  name character(20),
  siren character(9),
  type character(2),
  CONSTRAINT id_pk_thirdparty PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.thirdparty
  OWNER TO "sandbox-user";
  
CREATE TABLE public.users
(
  id integer NOT NULL DEFAULT nextval('users_id_seq'::regclass), -- user's internal id
  name character(20), -- user's name
  email character(40), -- user's mail
  CONSTRAINT id_pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.users
  OWNER TO "sandbox-user";
COMMENT ON COLUMN public.users.id IS 'user''s internal id';
COMMENT ON COLUMN public.users.name IS 'user''s name';
COMMENT ON COLUMN public.users.email IS 'user''s mail';
