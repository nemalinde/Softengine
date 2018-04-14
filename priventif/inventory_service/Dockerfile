FROM ubuntu:16.04

RUN apt-get update -y && \
    apt-get install -y python-pip python-dev && \
    pip install --upgrade pip setuptools

WORKDIR /inventory_service
# We copy this file first to leverage docker cache
COPY ./requirements.txt /inventory_service/requirements.txt

COPY . /inventory_service

RUN pip install -r requirements.txt

WORKDIR /inventory_service

RUN python setup.py develop

CMD [ "pserve development.ini --reload" ]

EXPOSE 6543
