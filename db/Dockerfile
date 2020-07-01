FROM library/postgres
ENV POSTGRES_USER "docker"
ENV POSTGRES_PASSWORD "docker"
ENV POSTGRES_DB "docker"
ENV POSTGRES_HOST_AUTH_METHOD "trust"
COPY script.sql /docker-entrypoint-initdb.d/
