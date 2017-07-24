/**
 * @license
 * Copyright color-coding studio. All Rights Reserved.
 *
 * Use of this source code is governed by an Apache License, Version 2.0
 * that can be found in the LICENSE file at http://www.apache.org/licenses/LICENSE-2.0
 */

import {
    FetchCaller,
    SaveCaller
} from "ibas/index";
import * as bo from "./bo/index"

/** 业务仓库 */
export interface IBORepositoryReceipts {

    /**
     * 查询 收款
     * @param fetcher 查询者
     */
    fetchReceipt(fetcher: FetchCaller<bo.IReceipt>);
    /**
     * 保存 收款
     * @param saver 保存者
     */
    saveReceipt(saver: SaveCaller<bo.IReceipt>);


}
