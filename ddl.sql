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