/**
 * @license
 * Copyright color-coding studio. All Rights Reserved.
 *
 * Use of this source code is governed by an Apache License, Version 2.0
 * that can be found in the LICENSE file at http://www.apache.org/licenses/LICENSE-2.0
 */

import * as ibas from "ibas/index";
import { ReceiptListApp } from "./ReceiptListApp";

export class ReceiptFunc extends ibas.ModuleFunction {

    /** 功能标识 */
    static FUNCTION_ID = "8abde6f4-c8ce-4541-b864-a3df85a7ec39";
    /** 功能名称 */
    static FUNCTION_NAME = "receipts_func_receipt";
    /** 构造函数 */
    constructor() {
        super();
        this.id = ReceiptFunc.FUNCTION_ID;
        this.name = ReceiptFunc.FUNCTION_NAME;
        this.description = ibas.i18n.prop(this.name);
    }
    /** 默认功能 */
    default(): ibas.IApplication<ibas.IView> {
        let app: ReceiptListApp = new ReceiptListApp();
        app.navigation = this.navigation;
        return app;
    }
}
