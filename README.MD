# Bank account generator
[![License](http://img.shields.io/:license-mit-blue.svg)](http://badges.mit-license.org)

This utility helps you to generate valid bank account numbers for Russian Federation bank system.

Usage
-----
Parameters:
-c (--currency) currency of account.
            Default value: RUB - russian rubble;
            Available values: RUB, USD, EUR;

-b (--bic)  BIC number (Bank identification number in Russian Federation).

-t (--type) type of generated account.
            Default value: PERSONAL
            Acceptable values:
            PERSONAL      - personal account number;
            PERSONAL_IP   - account for self-employed;
            BUDGET        - budget organization account;
            FOREIGN_PERSONAL - personal account for foreigners;
            

TODO: add validation


Copiright
------
Copyright (c) 2016 Vitaly Sidorov. See LICENSE for further details.