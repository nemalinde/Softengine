FROM ubuntu:16.04

RUN apt-get update -y && \
    apt-get install -y python-pip python-dev && \
    pip install --upgrade pip setuptools

WORKDIR /web_app
# We copy this file first to leverage docker cache
COPY ./requirements.txt /web_app/requirements.txt

COPY . /web_app

RUN pip install -r requirements.txt

WORKDIR /web_app

RUN python setup.py develop

CMD [ "pserve development.ini --reload" ]

EXPOSE 6543
