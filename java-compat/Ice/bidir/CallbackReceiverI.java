//
// Copyright (c) ZeroC, Inc. All rights reserved.
//

import Demo.*;

class CallbackReceiverI extends _CallbackReceiverDisp
{
    CallbackReceiverI()
    {
    }

    @Override
    public void
    callback(int num, Ice.Current current)
    {
        System.out.println("received callback #" + num);
    }
}
