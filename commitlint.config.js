/* eslint-disable max-lines */

'use strict';

module.exports = {
  rules: {
    'body-leading-blank': [
      2,
      'always'
    ],
    'body-max-length': [
      2,
      'always',
      Infinity
    ],
    'body-min-length': [
      2,
      'always',
      0
    ],
    'footer-leading-blank': [
      2,
      'always'
    ],
    'footer-max-length': [
      2,
      'always',
      Infinity
    ],
    'footer-min-length': [
      2,
      'always',
      0
    ],
    'header-max-length': [
      2,
      'always',
      72
    ],
    'header-min-length': [
      2,
      'always',
      0
    ],
    'scope-case': [
      2,
      'always',
      'lower-case'
    ],
    'scope-max-length': [
      2,
      'always',
      Infinity
    ],
    'scope-min-length': [
      2,
      'always',
      0
    ],
    'subject-case': [
      2,
      'always',
      'sentence-case'
    ],
    'subject-empty': [
      2,
      'never'
    ],
    'subject-full-stop': [
      2,
      'never',
      '.'
    ],
    'subject-max-length': [
      2,
      'always',
      Infinity
    ],
    'subject-min-length': [
      2,
      'always',
      0
    ],
    'type-case': [
      2,
      'always',
      'lower-case'
    ],
    'type-empty': [
      2,
      'never'
    ],
    'type-max-length': [
      2,
      'always',
      Infinity
    ],
    'type-min-length': [
      2,
      'always',
      0
    ],
    'type-enum': [
      2,
      'always',
      [
        'build',
        'ci',
        'docs',
        'feat',
        'fix',
        'perf',
        'refactor',
        'revert',
        'style',
        'test'
      ]
    ]
  }
};
