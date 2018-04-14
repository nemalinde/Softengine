FROM ubuntu:16.04

RUN apt-get update -y && \
    apt-get install -y python-pip python-dev && \
    pip install --upgrade pip setuptools

COPY ./requirements.txt /usr/local/priventif/web_app/requirements.txt

WORKDIR /usr/local/priventif/web_app

RUN pip install -r requirements.txt

COPY . /usr/local/priventif/web_app
RUN pip install -e .
RUN pip freeze
RUN ls
RUN echo "PWD is: $PWD"
RUN echo "The path is : $PATH"

CMD pserve development.ini --reload