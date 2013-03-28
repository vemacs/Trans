Trans
=====

A simple plugin that translates ingame chat messages to the language of your choice using the [Google Translate API](http://www.datatables.org/google/google.translate.xml), with a simple [YQL response parser](http://developer.yahoo.com/yql/console/?q=select%20*%20from%20google.translate%20where%20q%3D%22This%20is%20a%20test%22%20and%20target%3D%22de%22%3B&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys#h=select%20*%20from%20google.translate%20where%20q%3D%22testing testing%22%20and%20target%3D%22es%22%3B) using the default Yahoo YQL tables.

Installation
------------

Drag and drop into your /plugins folder.

Configuration
-------------

    lang: a [2-letter ISO 639-1 Code](http://www.loc.gov/standards/iso639-2/php/code_list.php)
    uppercase: whether or not to capitalize the translated message

Commands
--------

* `/trans` - reloads the config

Permissions
-----------

* `trans.reload` - permission to reload the config