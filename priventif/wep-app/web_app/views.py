from pyramid.view import view_config


@view_config(route_name='home', renderer='templates/home_template.pt')
def my_view(request):
    return {'project': 'web_app'}


@view_config(route_name='index', renderer='static/html/index.pt')
def index(request):
    return {'project': 'web_app'}
