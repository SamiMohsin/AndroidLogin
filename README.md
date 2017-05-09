#### AndroidLogin

Nice Android Login GUI

But animation should be ajust with life cycle of application for example


onDestroy->`anime.stop();` 


to ensure not working in background or something.

To make gradient change every 5 sec.
in your main activity onCreate()
 ```
 RelativeLayout container = (RelativeLayout) findViewById(R.id.container);

        AnimationDrawable anim = (AnimationDrawable) container.getBackground();
        anim.setEnterFadeDuration(5000);
        anim.setExitFadeDuration(5000);
```

in your onStart()

```
        if (anim != null && !anim.isRunning())
            anim.start();
            
```

in Your onDestroy()

```
        if (anim.isRunning())
            anim.stop();
            
```

and good luck.
